package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doomhammer_352 : Card() {
    override val id = 352
    override val name = "毁灭之锤"
    override val description = "<b>风怒，过载：</b>（2）"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "奥格瑞姆·毁灭之锤将他的传奇武器赠与了萨尔。他的名字只是纯属巧合。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2cfb03a69d9bdac7cdeb00f90f50fa946a3c852347080858638e3ee189dfa61.png"
}
