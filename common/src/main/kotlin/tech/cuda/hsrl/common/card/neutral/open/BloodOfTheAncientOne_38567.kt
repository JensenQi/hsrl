package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodOfTheAncientOne_38567 : Card() {
    override val id = 38567
    override val name = "远古造物之血"
    override val description = "在你的回合结束时，如果你控制两个远古造物之血，则将其融合成远古造物。"
    override var cost: Int? = 9
    override var health: Int? = 9
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "一杯柠檬汁外加两杯远古造物之血，再加点朗姆酒摇匀后，充满着远古风情的鸡尾酒就制作好了。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a506cbce1ef431fbfec339f48dfc0073659cd096ee93defc2a4dd910e6772ef.png"
}
