package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doomhammer_69981 : Card() {
    override val id = 69981
    override val name = "毁灭之锤"
    override val description = "<b>风怒，过载：</b>（2）"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "奥格瑞姆·毁灭之锤将他的传奇武器赠与了萨尔。他的名字只是纯属巧合。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/de55b80c6a18ed6a643b00133b89724c06291b8ff0728b45b1e8a6418e105fd3.png"
}
