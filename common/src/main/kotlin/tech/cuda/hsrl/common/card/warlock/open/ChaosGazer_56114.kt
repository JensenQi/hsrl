package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChaosGazer_56114 : Card() {
    override val id = 56114
    override val name = "混乱凝视者"
    override val description = "<b>战吼：</b>诅咒你对手的一张可用手牌。对手将有一个回合的机会来使用那张牌！"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "再看我，再看我就把你丢掉！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/74a71b3600e85cb0924b74ae7f2e6c45c484eb3a3405e9cc4125c01d149c08a8.png"
}
