package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PickPocket_47799 : Card() {
    override val id = 47799
    override val name = "搜索"
    override val description = "<b>回响</b> 随机将一张<i>（你对手职业的）</i>卡牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "因为他的腰弯不下这么低，所以侏儒们的钱包幸免于难。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/daac418f8d3a50188ae5fcc976fb68327ff3b0f33fc0c868d1fa890b3d4045e1.png"
}
