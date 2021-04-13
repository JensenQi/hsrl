package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FistOfJaraxxus_2628 : Card() {
    override val id = 2628
    override val name = "加拉克苏斯之拳"
    override val description = "当你使用或弃掉这张牌时，随机对一个敌人造成 4点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Tgt
    override val background = "实际上出拳者并非加拉克苏斯本人。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c72755795c7c45a9fa92223bf24a8fc9e2e941545621a9f8e39836b2dce1d54.png"
}
