package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FacelessSummoner_38725 : Card() {
    override val id = 38725
    override val name = "无面召唤者"
    override val description = "<b>战吼：</b>随机召唤一个法力值消耗为（3）的随从。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Wotog
    override val background = "无面者夜以继日不停工作，却从未得到应有的认可。"
    override val artist = "Mark Abadier"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b02d91e7d1992a69c2422f9ae7d1e6706de0f7866abe787791454baa9f35949.png"
}
