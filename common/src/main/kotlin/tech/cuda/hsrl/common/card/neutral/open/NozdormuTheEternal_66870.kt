package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NozdormuTheEternal_66870 : Card() {
    override val id = 66870
    override val name = "永恒者诺兹多姆"
    override val description = "<b>对战开始时：</b>如果双方玩家的牌库中都有该随从，则每个回合只有15秒。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "享受快节奏的生活吧（如果你的对手也愿意的话）。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c8a637c5ca5075b32cb9394727e721c37c95f73b9bbc7e36a848e77fc5d5ce49.png"
}
