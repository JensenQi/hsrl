package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Icicle_52255 : Card() {
    override val id = 52255
    override val name = "冰刺"
    override val description = "对一个随从造成 2点伤害。如果它已被<b>冻结</b>，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "这个法术听起来很次，实际上并非如此。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7bf5438e2fd26c6bfc1ea5530108551a11c8768e4039e42117fc1c6934e94379.png"
}
