package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doomhammer_69630 : Card() {
    override val id = 69630
    override val name = "毁灭之锤"
    override val description = "<b>风怒，过载：</b>（2）"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "奥格瑞姆·毁灭之锤将他的传奇武器赠与了萨尔。他的名字只是纯属巧合。"
    override val artist = "John Polidora"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/60b0c4b6f9fd2fecfcc373fe2a838212bb52f051f6ee9903201233c6d1de07a9.png"
}
