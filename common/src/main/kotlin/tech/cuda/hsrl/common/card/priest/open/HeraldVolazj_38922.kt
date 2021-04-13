package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HeraldVolazj_38922 : Card() {
    override val id = 38922
    override val name = "传令官沃拉兹"
    override val description = "<b>战吼：</b>召唤所有其他友方随从的复制，他们均为1/1。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Wotog
    override val background = "作为传令官他的工作其实很简单，就是整天吆喝：“尤格-萨隆要来啦！”"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e78a9c70fc52bb98f5d38308e9d07caaee02d131ddb7e8a55d886fd506a6b54e.png"
}
