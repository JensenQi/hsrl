package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Felstalker_68460 : Card() {
    override val id = 68460
    override val name = "魔犬"
    override val description = "<b>战吼：</b> 随机弃一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "这个小家伙不咬鞋改咬卡牌了。"
    override val artist = "Alex Horley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3cf82d2a38aec930a13607cfb9a0a49e186ed772b3ad71330eb4823acde5443f.png"
}
