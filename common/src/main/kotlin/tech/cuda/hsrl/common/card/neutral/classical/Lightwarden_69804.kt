package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lightwarden_69804 : Card() {
    override val id = 69804
    override val name = "圣光护卫者"
    override val description = "每当一个角色获得治疗，便获得 +2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她善于从别人的希望之中获取力量。"
    override val artist = "Erik Ko"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ea4e297c850ad325ea9327fd6dbc6b7d61bb7195e87a23232be01386d5b4c16.png"
}
