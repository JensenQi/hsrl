package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldIllusionist_45936 : Card() {
    override val id = 45936
    override val name = "狗头人幻术师 "
    override val description = "<b>亡语：</b>从你的手牌中召唤一个随从的 1/1复制。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "在他手里任何东西都可以变成蜡烛。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/481626fc273f3e002a6122f470c488355c44720226450372538794adee17cb5e.png"
}
