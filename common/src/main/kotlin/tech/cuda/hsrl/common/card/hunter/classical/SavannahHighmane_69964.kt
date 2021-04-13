package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SavannahHighmane_69964 : Card() {
    override val id = 69964
    override val name = "长鬃草原狮"
    override val description = "<b>亡语：</b>召唤两只2/2的土狼。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "在偌大丛林的生存游戏中，即使是狮子也会被成群的土狼拖垮。"
    override val artist = "Milivoj Ceran"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec5b0ea805e9f18992200b0db6986cedf99fd0bf9c571e48ac99b5de6b88b8d5.png"
}
