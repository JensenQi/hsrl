package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Biteweed_41216 : Card() {
    override val id = 41216
    override val name = "食人草"
    override val description = "<b>连击：</b>在本回合中，你每使用一张其他牌，便获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "它还有一个名字，叫“范克里夫草”。"
    override val artist = "Craig Elliott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/36ebd1e16c9a7fbab1d67919c6fe9108337120fb25963c54fe4a11a1ca8f4724.png"
}
