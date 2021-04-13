package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SneakyDevil_43493 : Card() {
    override val id = 43493
    override val name = "鬼祟恶魔"
    override val description = "<b>潜行</b> 你的其他随从获得+1攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "一名迪菲亚匪徒、一根变形术魔杖和一捆魔莲花共同酿成的悲剧。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22aa52fb566a14558b4cf278e9157bcefd28adb99872b3af08202c760cb6f0d3.png"
}
