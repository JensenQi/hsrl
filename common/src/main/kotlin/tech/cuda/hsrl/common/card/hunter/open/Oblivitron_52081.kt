package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Oblivitron_52081 : Card() {
    override val id = 52081
    override val name = "湮灭战车"
    override val description = "<b>亡语：</b>从你的手牌中召唤一个机械，并触发其<b>亡语</b>。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RiseOfShadows
    override val background = "循环利用，亡语不断！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b2a25408854c68291a93c1b385f5d4ec6d00eb362b2bc7206055fec1c60f6f01.png"
}
