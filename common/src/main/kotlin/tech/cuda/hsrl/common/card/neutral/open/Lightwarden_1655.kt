package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lightwarden_1655 : Card() {
    override val id = 1655
    override val name = "圣光护卫者"
    override val description = "每当一个角色获得治疗，便获得 +2攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "她善于从别人的希望之中获取力量。"
    override val artist = "Erik Ko"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/95619e6bb690ea3f82a5acd0d3d09344ab7495c175036bc8c9202b08cde292f8.png"
}
