package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneExplosion_68323 : Card() {
    override val id = 68323
    override val name = "魔爆术"
    override val description = "对所有敌方随从造成 1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "魔爆术曾是让法师们区别于艾泽拉斯其他职业的技能之一。"
    override val artist = "Howard Lyon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b9eacf537f729b357f21b73a13cec2417fc072055e66613a6b24e0cea722759f.png"
}
