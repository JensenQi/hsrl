package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilasDarkmoon_61640 : Card() {
    override val id = 61640
    override val name = "希拉斯·暗月"
    override val description = "<b>战吼：</b>选择一个方向，让所有随从转 起来。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“你对我的印象大概来自这些游览经历，像什么‘被装在大炮里打出去’啊，或者‘旋转木马把我的朋友吃了’这种回忆。”"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8e8b8a0706e0dec5b1a9bb1c89e3f4a452ade5bb9bf4d444007b260ea20b9978.png"
}
