package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KunTheForgottenKing_40416 : Card() {
    override val id = 40416
    override val name = "遗忘之王库恩"
    override val description = "<b>抉择：</b>获得10点护甲值；或者复原你的法力水晶。"
    override var cost: Int? = 10
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "艾雅抽取了库恩的些许灵魂，用以激活她的青玉大军。这可不是抽点血那么简单，遗忘之王得休息好一阵子了。"
    override val artist = "Jon Neimeister"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e840e30e9dc32ff8aacd68d9953acbc6819abb2f920f3f07b513bb8b43426e0.png"
}
