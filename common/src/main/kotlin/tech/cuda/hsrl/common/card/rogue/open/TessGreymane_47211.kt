package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TessGreymane_47211 : Card() {
    override val id = 47211
    override val name = "苔丝·格雷迈恩"
    override val description = "<b>战吼：</b>重新使用在本局对战中你所使用过的另一职业的卡牌<i>（目标随机而定）</i>。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "忘记出牌历史就意味着重蹈失败的覆辙。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f618b7fd81d1679a72c98e6cf62020966ddf5e7b4bdbac9ac73a3f79817755b.png"
}
