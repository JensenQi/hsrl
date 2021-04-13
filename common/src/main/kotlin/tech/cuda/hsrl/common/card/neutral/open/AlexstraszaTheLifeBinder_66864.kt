package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AlexstraszaTheLifeBinder_66864 : Card() {
    override val id = 66864
    override val name = "生命的缚誓者阿莱克丝塔萨"
    override val description = "<b>战吼：</b>选择一个角色。如果是友方角色，为其恢复8点生命值；如果是敌方角色，对其造成8点伤害。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "友方伤害：已关闭"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a8fcfd2e35325429245ef3970325d2e6fb3014833ec8e899cf3756f5b47f771b.png"
}
