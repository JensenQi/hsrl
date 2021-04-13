package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GolakkaCrawler_41316 : Card() {
    override val id = 41316
    override val name = "葛拉卡爬行蟹"
    override val description = "<b>战吼：</b>消灭一个海盗，并获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "海盗们闻之色变的究极克星！"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/49b571da768101c6e8bd3c19fb9b0d02f5358ccb83cd18872ed9a41f324cb638.png"
}
