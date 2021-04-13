package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Zap_47222 : Card() {
    override val id = 47222
    override val name = "静电震击"
    override val description = "对一个随从造成 2点伤害。<b>过载：</b>（1）"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.TheWitchwood
    override val background = "严禁在鱼塘使用这一法术！"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7e4cab9eb5222f3f9f97d979a770a83d6410b44576688c901793010c877eb89.png"
}
