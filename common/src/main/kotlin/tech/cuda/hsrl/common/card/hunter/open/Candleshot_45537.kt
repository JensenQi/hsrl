package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Candleshot_45537 : Card() {
    override val id = 45537
    override val name = "蜡烛弓"
    override val description = "你的英雄在攻击时具有<b>免疫</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "曾经被称作“卡恩迪洛尔”，精灵语的意思是“上古剃须匠的短弓”。"
    override val artist = "Anton Kagounkin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ea01c8e0b810e36e20423fe04e69b40516fafa15faafd4afe4d464c58149a5aa.png"
}
