package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VulgarHomunculus_43121 : Card() {
    override val id = 43121
    override val name = "粗俗的矮劣魔"
    override val description = "<b>嘲讽，战吼：</b>对你的英雄造成2点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "他总想朝别人做粗鄙的手势，幸好他没有中指。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e20ecd1494d7eedc5259662f84234c95fc533435244c15caaf870ddf4b81966.png"
}
