package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RagingFelscreamer_56765 : Card() {
    override val id = 56765
    override val name = "暴怒邪吼者"
    override val description = "<b>战吼：</b>你的下一张恶魔牌的法力值消耗减少（2）点。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "吼得再响也减不了非恶魔牌的消耗。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6f2f5d83ff63e083dead5121bf80d4a9a9d4b61b56b6e8648cc6e00e70368737.png"
}
