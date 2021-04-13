package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoargArtificer_57193 : Card() {
    override val id = 57193
    override val name = "莫尔葛工匠"
    override val description = "所有随从受到的法术伤害翻倍。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "听说工匠精神就是钻眼精神。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5ef02e5a0786a7725ec73bb5c5ebe02fa69d0e089935e374f67a70c2fafb1271.png"
}
