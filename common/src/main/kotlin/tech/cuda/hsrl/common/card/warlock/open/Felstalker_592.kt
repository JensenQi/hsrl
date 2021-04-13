package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Felstalker_592 : Card() {
    override val id = 592
    override val name = "魔犬"
    override val description = "<b>战吼：</b> 随机弃一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "这个小家伙不咬鞋改咬卡牌了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a9d12f2b0bf57a657bf69af829717989958365e5da05f024af6e7ced40d04f04.png"
}
