package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MuseumCurator_2878 : Card() {
    override val id = 2878
    override val name = "博物馆馆长"
    override val description = "<b>战吼： 发现</b>一张<b>亡语</b>牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Loe
    override val background = "馆长的脾气不太好，这都要归咎于那些攀爬书架的熊孩子和企图复活展品的疯子们。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0bda4b67842ed10f12c9cf8e726d008a99d1dbf868378a5d1461d8b3e9cd3a0b.png"
}
