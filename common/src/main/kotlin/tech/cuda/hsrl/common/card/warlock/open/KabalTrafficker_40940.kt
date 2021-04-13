package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KabalTrafficker_40940 : Card() {
    override val id = 40940
    override val name = "暗金教恶魔商贩"
    override val description = "在你的回合结束时，随机将一张恶魔牌置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "她最爱的运输方式，就是把水晶藏在印有漏斗蛋糕的包裹里。"
    override val artist = "Jon Neimeister"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/27c06b72359f0dac4afbf7072ecceb015e5c522aead9481384001bfc08a901a1.png"
}
