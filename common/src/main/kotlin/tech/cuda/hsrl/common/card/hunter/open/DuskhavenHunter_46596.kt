package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DuskhavenHunter_46596 : Card() {
    override val id = 46596
    override val name = "暮湾镇猎手"
    override val description = "<b>潜行</b> 如果这张牌在你的手牌中，每个回合使其攻击力和生命值互换。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "她最怕别人挠她肚皮，完全没有抵抗力。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c664cfbad3b41f433cb02ad5d46294f1369918e4b5dc851d267714a8ad1401cd.png"
}
