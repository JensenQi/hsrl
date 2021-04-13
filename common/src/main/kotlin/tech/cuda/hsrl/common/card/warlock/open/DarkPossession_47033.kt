package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkPossession_47033 : Card() {
    override val id = 47033
    override val name = "黑暗附体"
    override val description = "对一个友方角色造成 2点伤害。<b>发现</b>一张恶魔牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "听说目标是侏儒的话效果会更好。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b387fea5a333965662f2568362eee87f506d77a9334bd0037779465e136c7739.png"
}
