package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CoffinCrasher_47836 : Card() {
    override val id = 47836
    override val name = "破棺者"
    override val description = "<b>亡语：</b>从你的手牌中召唤一个<b>亡语</b>随从。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.TheWitchwood
    override val background = "红白喜事他都接。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b74f3290c440984e3213b575088ca4deac5522867df5a929ce916337e6681d8b.png"
}
