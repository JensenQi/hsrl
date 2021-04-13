package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AstralTiger_43304 : Card() {
    override val id = 43304
    override val name = "星界猛虎"
    override val description = "<b>亡语：</b> 将该随从的一张复制洗入你的牌库。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "你知道星界猫砂有多难找吗！"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ebbed6e7d0a1ff29ab815fabe7d4a2c36be1ea162be1a3191e4f48bc4c8e6752.png"
}
