package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvilMiscreant_52111 : Card() {
    override val id = 52111
    override val name = "怪盗恶霸"
    override val description = "<b>连击：</b>随机将两张<b>跟班</b>牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "恶霸身边通常都会跟两个狗腿子。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf6cdd1aab79ab1733ee89aacb10176d577ce8eb3456166176b39d1f61ece74a.png"
}
