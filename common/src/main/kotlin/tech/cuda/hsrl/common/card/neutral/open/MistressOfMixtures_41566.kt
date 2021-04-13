package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MistressOfMixtures_41566 : Card() {
    override val id = 41566
    override val name = "亡灵药剂师"
    override val description = "<b>亡语：</b>为每个英雄恢复 4点生命值。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "相信我，我在喝下这瓶药水前就已经死了。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5727ea39f037cb438433e671030d77df61f0c689597356e5b2391a4ba3438724.png"
}
