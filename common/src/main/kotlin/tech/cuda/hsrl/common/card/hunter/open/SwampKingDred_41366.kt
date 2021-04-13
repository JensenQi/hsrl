package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwampKingDred_41366 : Card() {
    override val id = 41366
    override val name = "沼泽之王爵德"
    override val description = "在你的对手使用一张随从牌后，攻击该 随从。"
    override var cost: Int? = 7
    override var health: Int? = 9
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "常年生活在沼泽潮湿环境下的爵德，不可避免地患上了关节炎。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6195dc3a77d00ef42cac3b4aa0c402a028b9782c3d2dd48690f03f439f1c5733.png"
}
