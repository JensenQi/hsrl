package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Helboar_56483 : Card() {
    override val id = 56483
    override val name = "地狱野猪"
    override val description = "<b>亡语：</b>随机使你手牌中的一张野兽牌获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "地狱野猪培根，野兽的最爱！"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d0a6c1638be78b88328883416972233f7dd14e3695f11105543ab4ee234d6ec0.png"
}
