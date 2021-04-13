package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelSummoner_59864 : Card() {
    override val id = 59864
    override val name = "邪能召唤师"
    override val description = "<b>亡语：</b>随机从你的手牌中召唤一个恶魔。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "看邪能与恶魔终成眷属。"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f6034b407c7012bd1bdcd3447ffd8de1a55fb7ac9ab4785c28ba3252ebac53a9.png"
}
