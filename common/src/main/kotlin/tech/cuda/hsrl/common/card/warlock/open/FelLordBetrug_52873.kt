package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelLordBetrug_52873 : Card() {
    override val id = 52873
    override val name = "邪能领主贝图格"
    override val description = "每当你抽到一张随从牌，召唤一个它的复制。该复制具有<b>突袭</b>，并会在回合结束时死亡。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "突袭不规范，亲人两行泪。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ea72891fc4159f89995e9c5876d83eb03cc8ddc9e4e7e225a1741953a73a6c21.png"
}
