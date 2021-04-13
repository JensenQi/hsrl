package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathwingMadAspect_55007 : Card() {
    override val id = 55007
    override val name = "疯狂巨龙死亡之翼"
    override val description = "<b>战吼：</b>攻击所有其他随从。"
    override var cost: Int? = 8
    override var health: Int? = 12
    override var attack: Int? = 12
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "咬住那个，再咬一口第二个，抓住这个，再把那个整个吞掉……"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b91c504ec7b7f738b2f2f80d47242ea156aa6afcd0f9a4767b787f0b7f81508.png"
}
