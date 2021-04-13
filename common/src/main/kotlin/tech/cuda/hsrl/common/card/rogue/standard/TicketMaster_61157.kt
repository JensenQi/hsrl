package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TicketMaster_61157 : Card() {
    override val id = 61157
    override val name = "奖券老板"
    override val description = "<b>亡语：</b>将三张奖券洗入你的牌库。当抽到奖券时，召唤一个3/3的玩具熊。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "你可以用一张奖券换一个玩具熊，也可以攒上一千张，换一个艳俗的夜光纪念品！"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a90c272c2545daffa8b8a6c8f39acdc5f1082b439057832b812a0909bcd8a158.png"
}
