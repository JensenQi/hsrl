package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManicSoulcaster_40935 : Card() {
    override val id = 40935
    override val name = "狂热铸魂者"
    override val description = "<b>战吼：</b>选择一个友方随从，将它的一张复制洗入你的牌库。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "无论何种竞技，她都会全身心投入其中！"
    override val artist = "J. Ejsing & E. Amundsen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34a9527059b61288d2839e82fef59f922b7b108004be1b1c5ac05b2103ce29a6.png"
}
