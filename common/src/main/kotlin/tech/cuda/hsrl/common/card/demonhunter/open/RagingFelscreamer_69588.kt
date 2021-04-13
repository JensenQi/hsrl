package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RagingFelscreamer_69588 : Card() {
    override val id = 69588
    override val name = "暴怒邪吼者"
    override val description = "<b>战吼：</b>你的下一张恶魔牌的法力值消耗减少（2）点。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "吼得再响也减不了非恶魔牌的消耗。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c9685df4add3526660e852330f90d8d30e5a7cc4191a650635baa3dedeb4bb6.png"
}
