package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowBolt_68341 : Card() {
    override val id = 68341
    override val name = "暗影箭"
    override val description = "对一个随从造成 4点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "黑暗中的威胁 —— 明枪易躲，暗箭难防。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1af665ab0e6a0a08f7ab95b3a83287490a611d911e24908f874dc2d5e563806e.png"
}
