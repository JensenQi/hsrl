package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LynessaSunsorrow_45539 : Card() {
    override val id = 45539
    override val name = "莱妮莎·炎伤"
    override val description = "<b>战吼：</b>将你在本局对战中对友方随从施放过的所有法术施放在此随从身上。"
    override var cost: Int? = 7
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "纯粹魔法能量构成的饮食有利于保持身材，但会使情绪变得混乱。"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/39433e4a3a0bef2335ecca8aee7b31791730e41881011cf5beaa6fc0081e0451.png"
}
