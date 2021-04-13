package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowBolt_914 : Card() {
    override val id = 914
    override val name = "暗影箭"
    override val description = "对一个随从造成 4点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "黑暗中的威胁 —— 明枪易躲，暗箭难防。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cb502c58b46894d4a852942cfa058b4e3914c00e813fee1a39844ff989b97971.png"
}
