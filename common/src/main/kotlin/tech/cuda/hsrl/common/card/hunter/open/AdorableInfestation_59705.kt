package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AdorableInfestation_59705 : Card() {
    override val id = 59705
    override val name = "萌物来袭"
    override val description = "使一个随从获得+1/+1。召唤一个1/1的魔鼠宝宝。将一张魔鼠宝宝置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "有的卡牌强是因为超模，有的卡牌强是因为可爱。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4d073cdca04c8b2abb7d6a7f71bfba8ef85141ecb2ab221e6c5c72c085e46a8c.png"
}
