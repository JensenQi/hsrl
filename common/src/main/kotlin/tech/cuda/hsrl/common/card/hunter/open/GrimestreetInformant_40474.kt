package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimestreetInformant_40474 : Card() {
    override val id = 40474
    override val name = "污手街情报员"
    override val description = "<b>战吼：</b><b>发现</b>一张 猎人、圣骑士或战士卡牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "想要第一手的情报吗？你得先交钱！"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f03ae919c2eaa0c25c92f83bc67924da55854996e9b8547029e48b3f7bf29538.png"
}
