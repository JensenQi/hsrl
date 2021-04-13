package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneExplosion_447 : Card() {
    override val id = 447
    override val name = "魔爆术"
    override val description = "对所有敌方随从造成 1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "魔爆术曾是让法师们区别于艾泽拉斯其他职业的技能之一。"
    override val artist = "Howard Lyon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e165cf282bc04d7e3b27c00c5a9e09e40270c1161e5b993853aa1bac5ba137b5.png"
}
