package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DozingMarksman_50493 : Card() {
    override val id = 50493
    override val name = "嗜睡的神枪手"
    override val description = "受伤时具有 +4攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "当前版本的特困生。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e34d38c82d826bb790afaae0baa81f4237aefbdac6f5891fddac0b0375f79f3f.png"
}
