package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RustswornInitiate_56391 : Card() {
    override val id = 56391
    override val name = "锈誓新兵"
    override val description = "<b>亡语：</b>召唤一个1/1并具有<b>法术伤害+1</b>的小鬼施法者。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "铁锈军团的训练并不完善。他甚至连破伤风都没打！"
    override val artist = "Zero"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c9fc817c9be99457b3c1ba41b8864d2562121c1eaae0f0ec1281e08ec72a8fc1.png"
}
